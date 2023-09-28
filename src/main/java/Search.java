
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

    public Fraction findFractionMultiplicationByUserFamilyName(String familyName) {
        List<Fraction> fractions = new UsersDatabase().findAll()
                .filter(user -> user.getFamilyName().equals(familyName))
                .flatMap(user -> user.getFractions().stream())
                .collect(Collectors.toList());

        if (fractions.isEmpty()) {
            throw new IllegalArgumentException("No user found with the given family name.");
        }

        Fraction multiplicationResult = fractions.stream()
                .reduce(new Fraction(1, 1), Fraction::multiply);

        return multiplicationResult;
    }


}
