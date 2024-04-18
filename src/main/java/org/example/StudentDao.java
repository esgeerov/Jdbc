package org.example;



import java.sql.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class StudentDao {
    private Connection connection;

    public StudentDao(){
        String url="jdbc:oracle:thin:@localhost:1521:XE";
        String username="Ecourse";
        String password="12345";
        try(Connection connection=DriverManager.getConnection(url,password,username)){

        }catch (Exception e){
            e.printStackTrace();
        }
    }


    public  void addStudent(Student student) {
            String query = "INSERT INTO STUDENT(ID,NAME,SURNAME,DOB,ADDRESS,PHONE) VALUES (?,?,?,?,?,?)";
            try(PreparedStatement statement = connection.prepareStatement(query)){
            statement.setLong(1, student.getId());
            statement.setString(2, student.getName());
            statement.setString(3, student.getSurname());
            statement.setDate(4, student.getDob());
            statement.setString(5, student.getAddress());
            statement.setLong(6, student.getPhone());
            statement.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public Student getStudentById(Long id) {
        String url = "jdbc:oracle:thin:@localhost:1521:XE";
        String username = "Ecourse";
        String password = "12345";
        try (Connection connection = DriverManager.getConnection(url, username, password)) {
            String query = "SELECT * FROM STUDENT WHERE ID=?";
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setLong(1, id);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                Student student = new Student();
                student.setId(resultSet.getLong("id"));
                student.setName(resultSet.getString("name"));
                student.setSurname(resultSet.getString("surname"));
                student.setDob(resultSet.getDate("dob"));
                student.setAddress(resultSet.getString("address"));
                student.setDatadate(resultSet.getDate("data_date"));
                student.setNumber(resultSet.getLong("phone"));
                return student;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

   return null;
    }
    public Student deleteStudent(Long id){
        String url="jdbc:oracle:thin:@localhost:1521:XE";
        String username="Ecourse";
        String password="12345";

       try( Connection connection=DriverManager.getConnection(url,username,password)){
           String query="DELETE FROM STUDENT WHERE ID=?";
           PreparedStatement statement= connection.prepareStatement(query);
           statement.setLong(1,id);
           statement.executeUpdate();
       }catch (Exception e){
           e.printStackTrace();
       }

    return null;
    }
    public static void updateStduent(Student student){
        String url="jdbc:oracle:thin:@localhost:1521:XE";
        String username="Ecourse";
        String password="12345";

        try( Connection connection=DriverManager.getConnection(url,username,password)){
            String query="UPDATE STUDENT ";
            PreparedStatement statement= connection.prepareStatement(query);
            statement.setLong(1,student.getId());
            statement.executeUpdate();
        }catch (Exception e){
            e.printStackTrace();
        }

    }

}
