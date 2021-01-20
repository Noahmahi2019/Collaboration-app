//package com.schoolManagemntApplication;
//
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.SQLException;
//import java.sql.Statement;
//
//public class Database {
//
//    /*
//    School database
//        - Table for STUDENTS
//        -Table for INSTRUCTOR
//        -Table for  ADMINISTRATOR
//    */
//
//    public static final String DB_NAME = "school.db";
//    public static final String DB_PATH = "jdbc:sqlite:/c/Users/Bereket/ideaprojects/collaboration-app/school.db";
//    //public static final String DB_PATH = "jdbc:sqlite:c:\\collaboration-app\\school.db";
//
//    public static final String TABLE_STUDENT = "student";
//    public static final String COLUMN_STUDENT_ID = "_id";
//    public static final String COLUMN_STUDENT_USERNAME = "username";
//    public static final String COLUMN_STUDENT_PASSWORD = "password";
//    public static final String COLUMN_STUDENT_PHONENUMBER = "phoneNumber";
//    public static final String COLUMN_STUDENT_EMAIL = "email";
//    public static final String COLUMN_STUDENT_GRADE = "grade";
//
//    public static final String TABLE_INSTRUCTOR = "instructor";
//    public static final String COLUMN_INSTRUCTOR_ID = "_id";
//    public static final String COLUMN_INSTRUCTOR_PHONENUMBER = "phoneNumber";
//    public static final String COLUMN_INSTRUCTOR_EMAIL = "email";
//    public static final String COLUMN_INSTRUCTOR_COURSE = "course";
//
//    public static final String TABLE_ADMINISTRATOR = "administrator";
//    public static final String COLUMN_ADMINISTRATOR_ID = "_id";
//    public static final String COLUMN_ADMINISTRATOR_PHONENUMBER = "phoneNumber";
//    public static final String COLUMN_ADMINISTRATOR_EMAIL = "email";
//
//
//
//
//    public static void main(String[] args) {
//
//
//        try {
//
//            Connection conn = DriverManager.getConnection("jdbc:sqlite:/C:/Users/Bereket/ideaprojects/collaboration-app/school.db");
//
//            //this.conn = DriverManager.getConnection(DB_PATH);
//            Statement statement = conn.createStatement();
//            //statement.execute("CREATE TABLE STUDENT (id INTEGER, username TEXT, password phone Integer, email TEXT)");
//
//
//            // Delete existing db data
//
////               statement.execute(" DROP TABLE IF EXISTS" + TABLE_STUDENT);
////               statement.execute(" DROP TABLE IF EXISTS" + TABLE_INSTRUCTOR);
////               statement.execute(" DROP TABLE IF EXISTS" + TABLE_ADMINISTRATOR);
//
//            // Recreate deleted tables
//            statement.execute(" CREATE TABLE IF NOT EXISTS " + TABLE_STUDENT + "(" + COLUMN_STUDENT_ID + " INTEGER PRIMARY KEY," +
//                    COLUMN_STUDENT_USERNAME + "TEXT," + COLUMN_STUDENT_PASSWORD + " INTEGER," + COLUMN_STUDENT_PHONENUMBER + " TEXT,"
//                    + COLUMN_STUDENT_EMAIL + "TEXT," + COLUMN_STUDENT_GRADE + " INTEGER," );
//
//            statement.execute("INSERT INTO STUDENT (_id, username, password, phoneNumber,email, grade ) VALUES ('ab101' , 'berekett', 'Btsd333', '(111)1111', 'bereket@gmail.com', '3.4')");
//
//            statement.execute(" CREATE TABLE IF NOT EXISTS " + TABLE_INSTRUCTOR + "(" + COLUMN_INSTRUCTOR_ID + " INTEGER PRIMARY KEY," +
//                    COLUMN_INSTRUCTOR_PHONENUMBER + " TEXT, " + COLUMN_INSTRUCTOR_EMAIL + "TEXT, " + COLUMN_INSTRUCTOR_COURSE + " TEXT, ");
//
//            statement.execute(" CREATE TABLE IF NOT EXISTS " + TABLE_ADMINISTRATOR + "(" + COLUMN_ADMINISTRATOR_ID + " INTEGER PRIMARY KEY," +
//                    COLUMN_ADMINISTRATOR_PHONENUMBER + " TEXT, " + COLUMN_ADMINISTRATOR_EMAIL + "TEXT, ");
//
//        }
//        catch (SQLException e) {
//            System.out.println("SQL EXCEPTION: " + e.getMessage());
//            e.printStackTrace();
//
//        }
//    }
//    private static void createStudent(Statement statement, String name) {
//        try {
//            statement.execute("INSERT INTO " + TABLE_STUDENT + "(" +COLUMN_STUDENT_USERNAME + ")" + "VALUES(");
//
//        }
//        catch (SQLException e) {
//            System.out.println("ERROR creating students : " + e.getMessage());
//            e.printStackTrace();
//
//        }
//    }
//
//}