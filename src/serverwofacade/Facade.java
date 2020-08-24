/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serverwofacade;

/**
 *
 * @author Reo
 */
public class Facade {
    private static Facade FacadeObj = null;
        private Facade() {}
        public static Facade getMyFacadeObject() {
            if (FacadeObj == null) {
                FacadeObj = new Facade();
            } 
            return FacadeObj;
        }
        public void startFunc() {
            ScheduleServer startServer = new ScheduleServer();
            startServer.startBooting();
        }
        public void stopFunc() {
            ScheduleServer stopServer = new ScheduleServer();
            stopServer.shutdown();
        }
    
}
