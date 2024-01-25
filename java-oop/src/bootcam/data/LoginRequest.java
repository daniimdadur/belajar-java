package bootcam.data;

public record LoginRequest(String username,String password) {

    public LoginRequest {
        System.out.println("Create Object LoginRequest");

    }
    public LoginRequest(String username){
        this(username,"");
    }
    public LoginRequest(){
        this("","");
    }
}
