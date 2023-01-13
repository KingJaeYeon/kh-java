package ch14;

public class Member {
    private String userId;
    private String name;
    private String password;
    private String tel;
    private String email;

    public Member() {
    }

    public Member(String userId, String name, String password, String tel, String email) {
        this.userId = userId;
        this.password = password;
        this.name = name;
        this.tel = tel;
        this.email = email;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
