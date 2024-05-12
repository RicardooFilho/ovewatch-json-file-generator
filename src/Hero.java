import java.util.List;

public record Hero(String name, String description, String role, String location, String birthday, Integer age,
                   Hitpoints hitpoints, List<Abilities> abilities, Story story) {
}
