//package sda.soft.academy.lunchyproject.lunchy.validators;
//


/* Pomysł do wdrożenia póżniej.

https://www.baeldung.com/registration-password-strength-and-rules

Validator ma na celu ustawienie odpowiedniej siły hasłą np. liczba znaków, wielkie i małe litery, liczby i znaki specjalne.
Trzeba do tego jeszcze stworzyć dodatkowe klasy.
Do zrobienia później, gdy uporamy się z podstawowymi funkcjonalnościami.
 */


//public class PasswordConstraintValidator implements ConstraintValidator<ValidPassword, String> {
//
//    @Override
//    public void initialize(ValidPassword arg0) {
//    }
//
//    @Override
//    public boolean isValid(String password, ConstraintValidatorContext context) {
//        PasswordValidator validator = new PasswordValidator(Arrays.asList(
//                new LengthRule(8, 30),
//                new UppercaseCharacterRule(1),
//                new DigitCharacterRule(1),
//                new SpecialCharacterRule(1),
//                new NumericalSequenceRule(3,false),
//                new AlphabeticalSequenceRule(3,false),
//                new QwertySequenceRule(3,false),
//                new WhitespaceRule()));
//
//        RuleResult result = validator.validate(new PasswordData(password));
//        if (result.isValid()) {
//            return true;
//        }
//        context.disableDefaultConstraintViolation();
//        context.buildConstraintViolationWithTemplate(
//                Joiner.on(",").join(validator.getMessages(result)))
//                .addConstraintViolation();
//        return false;
//    }
//}
