


class User {
    private int id;
    private String name,address,gender,knowledge,subject,number;
    private byte[] pictire;
    
    
    
    public User(int id, String name,String address,String gender ,String knowledge, String subject,byte[] image ,String number){
        this.id=id;
        this.name=name;
        this.address=address;
        this.gender=gender;
        this.knowledge=knowledge;
        this.subject = subject;
        this.pictire = image;
        this.number = number;
        
    }
    public int getid(){
        return id;
    }
    public String getname(){
        return name;
    }
    public String getaddress(){
        return address;
    }
    public String getgender(){
        return gender;
    }
    public String getknowledge(){
        return knowledge;
    }
    public String getsubject(){
        return subject;
    }
    public byte[] getImage(){
        return pictire;
    }
    public String getNumber(){
        return number;
    }
    
}
