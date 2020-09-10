package no.fakestore.fakestore;

public enum Gender {

    MALE("Male"),
    FEMALE("Female"),
    OTHER("Prefer not to tell"),
    ;

    private final String displayName;
    Gender(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }
}


