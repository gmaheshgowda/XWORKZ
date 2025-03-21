public class GovernmentId {
    int id;
    String name;
    String authority;
    String country;
    int issuedYear;

    GovernmentId(int id, String name, String authority, String country, int issuedYear) {
        this.id = id;
        this.name = name;
        this.authority = authority;
        this.country = country;
        this.issuedYear = issuedYear;
    }
}