package ua.ictloud.lessons.jdbch2.itcloud.dao.impl;

import ua.ictloud.lessons.jdbch2.itcloud.dao.DriverDAO;

/**
 * Created by student on 15-Jun-18.
 */
public class Factory {
    private static DriverDAOH2Impl instance;

    public synchronized static DriverDAOH2Impl getInstance() {
        if (instance == null) {
            instance = new DriverDAOH2Impl();
        }
        return instance;
    }
}
