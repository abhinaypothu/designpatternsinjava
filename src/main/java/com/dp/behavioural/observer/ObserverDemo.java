package com.dp.behavioural.observer;

public class ObserverDemo {
    public static void main(String[] args) {
        Student ramu = new RegularStudent();
        Student sachin = new LateralEntryStudents();

        NotificationManager notificationManager = new NotificationManager();
        notificationManager.addStudent(ramu);
        notificationManager.addStudent(sachin);

        notificationManager.notifyAllStudents("Dear students, Class commencing from 10:00 PM to 12:00 AM");
    }
}
