package pojos.studentInfoManagement;

import java.io.Serializable;
public class StudentResponse implements Serializable{

    private String birthDay;
    private String fatherName;
    private String gender;
    private int studentNumber;
    private String motherName;
    private boolean active;
    private int userId;
    private String birthPlace;
    private String phoneNumber;
    private String surname;
    private String name;
    private String email;
    private String username;

    public StudentResponse() {
    }

    public StudentResponse(String birthDay, String fatherName, String gender, int studentNumber, String motherName, boolean active, int userId, String birthPlace, String phoneNumber, String surname, String name, String email, String username) {
        this.birthDay = birthDay;
        this.fatherName = fatherName;
        this.gender = gender;
        this.studentNumber = studentNumber;
        this.motherName = motherName;
        this.active = active;
        this.userId = userId;
        this.birthPlace = birthPlace;
        this.phoneNumber = phoneNumber;
        this.surname = surname;
        this.name = name;
        this.email = email;
        this.username = username;
    }

    public void setBirthDay(String birthDay){
        this.birthDay = birthDay;
    }

    public String getBirthDay(){
        return birthDay;
    }

    public void setFatherName(String fatherName){
        this.fatherName = fatherName;
    }

    public String getFatherName(){
        return fatherName;
    }

    public void setGender(String gender){
        this.gender = gender;
    }

    public String getGender(){
        return gender;
    }

    public void setStudentNumber(int studentNumber){
        this.studentNumber = studentNumber;
    }

    public int getStudentNumber(){
        return studentNumber;
    }

    public void setMotherName(String motherName){
        this.motherName = motherName;
    }

    public String getMotherName(){
        return motherName;
    }

    public void setActive(boolean active){
        this.active = active;
    }

    public boolean isActive(){
        return active;
    }

    public void setUserId(int userId){
        this.userId = userId;
    }

    public int getUserId(){
        return userId;
    }

    public void setBirthPlace(String birthPlace){
        this.birthPlace = birthPlace;
    }

    public String getBirthPlace(){
        return birthPlace;
    }

    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumber(){
        return phoneNumber;
    }

    public void setSurname(String surname){
        this.surname = surname;
    }

    public String getSurname(){
        return surname;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public String getEmail(){
        return email;
    }

    public void setUsername(String username){
        this.username = username;
    }

    public String getUsername(){
        return username;
    }

    @Override
    public String toString(){
        return
                "StudentResponse{" +
                        "birthDay = '" + birthDay + '\'' +
                        ",fatherName = '" + fatherName + '\'' +
                        ",gender = '" + gender + '\'' +
                        ",studentNumber = '" + studentNumber + '\'' +
                        ",motherName = '" + motherName + '\'' +
                        ",active = '" + active + '\'' +
                        ",userId = '" + userId + '\'' +
                        ",birthPlace = '" + birthPlace + '\'' +
                        ",phoneNumber = '" + phoneNumber + '\'' +
                        ",surname = '" + surname + '\'' +
                        ",name = '" + name + '\'' +
                        ",email = '" + email + '\'' +
                        ",username = '" + username + '\'' +
                        "}";
    }

}
