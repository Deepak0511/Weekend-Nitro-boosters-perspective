package in.dpk.nitro.beans;

public class Trailer {
    private String identifier;
    private String filler;
    private Long recordCount;

    public Trailer(String identifier, String filler, Long recordCount) {
        this.identifier = identifier;
        this.filler = filler;
        this.recordCount = recordCount;
    }

    public Trailer() {
    }

    @Override
    public String toString() {
        return "Trailer{" +
                "identifier='" + identifier + '\'' +
                ", filler='" + filler + '\'' +
                ", recordCount=" + recordCount +
                '}';
    }

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public String getFiller() {
        return filler;
    }

    public void setFiller(String filler) {
        this.filler = filler;
    }

    public Long getRecordCount() {
        return recordCount;
    }

    public void setRecordCount(Long recordCount) {
        this.recordCount = recordCount;
    }
}
