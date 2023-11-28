public class user {
    private int userid;
    private String firstName;
    private String lastName;
    private String email;
    private String address;

    public void setUserID(int id){
        this.userid = id;
    }

    public void setFirstName(String first){
        this.firstName = first;
    }

    public void setLastName(String last){
        this.lastName = last;
    }

    public void setEmail(String mail){
        this.email = mail;
    }

    public void setAddress(String add){
        this.address = add;
    }

    public int getUserID(){
        return this.userid;
    }

    public String getFirstName(){
        return this.firstName;
    }

    public String getLastName(){
        return this.lastName;
    }

    public String getEmail(){
        return this.email;
    }

    public String getAddress(){
        return this.address;
    }


    
}
