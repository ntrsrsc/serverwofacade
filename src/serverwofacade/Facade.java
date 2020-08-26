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
    private ScheduleServer scheduleServer = new ScheduleServer();
    public static Facade getMyFacadeObject() {
        if (FacadeObj == null) {
            FacadeObj = new Facade();
        } 
        return FacadeObj;
    }
    public void startFunc() {
        scheduleServer.startBooting();
        scheduleServer.readSystemConfigFile();
	scheduleServer.init();
	scheduleServer.initializeContext();
	scheduleServer.initializeListeners();
	scheduleServer.createSystemObjects();
	
        }
    public void stopFunc() {
        scheduleServer.releaseProcesses();
	scheduleServer.destory();
	scheduleServer.destroySystemObjects();
	scheduleServer.destoryListeners();
	scheduleServer.destoryContext();
	scheduleServer.shutdown();
    }
    
}
