package koschei.models;

import org.springframework.stereotype.Component;

@Component
public class Needle7 {
    private final Deth8 deth = new Deth8();

    /**
     * Задача составлена неправильно:
     * <p><code {@code }>return ", смерть Кощея на игле :( " + "";</code></p>
     * <ul><b><u>Логичное продолжение:</u></b>
     *     <li>создать метод toString() в классе Deth8;</li>
     *     <li>переместить смайлик в строку возврата метода toString класса Deth8;</li>
     *     <li>добавить приватное поле 'Deth8 deth' в класс Needle7;</li>
     *     <li>добавить создание бина от класса Deth8;</li>
     *     <li>внедрить зависимость от Deth8 в класс Needle7;</li>
     *     <li>добавить в строку возврата метода toString класса Needle7 вызов deth.toString().</li>
     * </ul>
     * */
    @Override
    public String toString() {
        return ", смерть Кощея на игле " + deth.toString();
    }
}
