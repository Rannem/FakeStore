package no.fakestore.fakestore;

public enum Gender {

    OTHER("Prefer not to tell"),
    MALE("Male"),
    FEMALE("Female"),
    ;

    private final String displayName;
    Gender(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }
}


