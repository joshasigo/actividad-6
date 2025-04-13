import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "events")
public class Event {
    @Id
    private String id;
    private String sensor;
    private double value;
    private String timestamp;

    // Getters and setters
}