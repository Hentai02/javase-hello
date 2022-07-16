package helloworldapp.exercises;

public class Student implements StudentAction{

    private int id;
    private String name;
    private boolean gender;
    private String cellphone;

    public Student() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public String getCellphone() {
        return cellphone;
    }

    public void setCellphone(String cellphone) {
        this.cellphone = cellphone;
    }

    @Override
    public void studying() {

    }

    @Override
    public void goSchool() {

    }

    @Override
    public void afterSchool() {

    }
}
