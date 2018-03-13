package java8;

import java.util.Objects;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;

public class Predicates {

    public static void main(String[] args) {
        Predicate<String> predicate = (s) -> s.length() > 0;

        predicate.test("foo"); // true
        predicate.negate().test("foo"); // false

        Predicate<Boolean> nonNull = Objects::nonNull;
        Predicate<Boolean> isNull = Objects::isNull;

        Predicate<String> isEmpty = String::isEmpty;
        Predicate<String> isNotEmpty = isEmpty.negate();
        
        
        Function<String, Integer> toInteger = Integer::valueOf;
        System.out.println(  toInteger.apply("1234"));
        
        
        Function<String, String> backToString = toInteger.andThen(String::valueOf);

        System.out.println(backToString.apply("123")); // "123"
        
        Optional<String> optional = Optional.of("bam");

        optional.isPresent(); // true
        optional.get(); // "bam"
        optional.orElse("fallback"); // "bam"

        optional.ifPresent((s) -> System.out.println(s.charAt(0))); // "b"
    }
    /**
     *   private List<IncomeDetailModel> convertToList(List<Object[]> list, List<Object[]> list2) {
        Map<String, List<DetailModel>>map2 =  list2.stream().map(array->{
            DetailModel detail = new DetailModel();
            detail.setMoneyChange((BigDecimal) array[1]);
            detail.setGlobalParentType(((Number) array[2]).intValue());
            detail.setProductName((String) array[3]);
            Integer productId = ((Number) array[4]).intValue();
            detail.setDingqi(productId != 0);
            detail.setProductId(productId);
            detail.setDate((String)array[0]);
            detail.setOrderId(((Number) array[5]).intValue());
            return detail;
        }).collect(Collectors.groupingBy(DetailModel::getDate));
        return  list.stream().map(array->{
            IncomeDetailModel idModel = new IncomeDetailModel();
            idModel.setDate((String) array[0]);
            idModel.setAmount((BigDecimal) array[1]);
            idModel.setDetailList(map2.get(array[0]));
            return idModel;
        }).collect(Collectors.toList());
    }
    
     */
}
