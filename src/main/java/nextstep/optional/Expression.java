package nextstep.optional;

import java.util.Arrays;

enum Expression {
    PLUS("+"), MINUS("-"), TIMES("*"), DIVIDE("/");

    private String expression;

    Expression(String expression) {
        this.expression = expression;
    }

    private static boolean matchExpression(Expression e, String expression) {
        return expression.equals(e.expression);
    }

    static Expression of(String expression) { // Enum 값 match 도 가볍게 Optional(findFirst()) 사용해서 error 까지 넘길수있다.
        return Arrays.stream(Expression.values()).filter(x -> matchExpression(x, expression)).findFirst()
            .orElseThrow(() -> new IllegalArgumentException(
                String.format("%s는 사칙연산에 해당하지 않는 표현식입니다.", expression)));
    }
}
