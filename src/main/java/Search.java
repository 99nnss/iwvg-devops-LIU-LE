
import java.util.List;
import java.util.stream.Stream;
import java.util.stream.Collectors;
public class Search {

    public Stream<String> findUserFamilyNameInitialBySomeProperFraction() {
        return new UsersDatabase().findAll()
                .flatMap(user -> user.getFractions().stream()
                        .filter(fraction -> fraction.isProper())
                        .map(fraction -> user.getFamilyName().substring(0, 1))
                )
                .distinct();
    }

}
