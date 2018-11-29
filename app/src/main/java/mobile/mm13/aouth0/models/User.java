package mobile.mm13.aouth0.models;

public class User {
    private String email;
    private String name;
    private String pictureURL;
    private String grantedScope;

    public User(String email, String name, String pictureURL, String grantedScope) {
        this.email = email;
        this.name = name;
        this.pictureURL = pictureURL;
        this.grantedScope = grantedScope;
    }

    public String getEmail() {
        return email;
    }

    public String getGrantedScope() {
        return grantedScope;
    }

    public String getName() {
        return name;
    }

    public String getPictureURL() {
        return pictureURL;
    }

    public Boolean hasScope(String scope) {
        return grantedScope.contains(scope);
    }
}