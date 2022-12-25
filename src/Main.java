public class Main {
    public static void main(String[] args) {
        byte a_byte = 127;
        System.out.println("переменная a_byte содержит сейчас максимальное число " + a_byte);

        short b_short = -32768;
        System.out.println("переменная b_short содержит сейчас минимальное число " + b_short);

        char ch1;
        ch1 = 'x';
        System.out.println("переменная ch1 содержит " + ch1);
        ch1++; // увеличим на единицу
        System.out.println("переменная ch1 содержит " + ch1);
        ch1++; // увеличим на единицу
        System.out.println("переменная ch1 содержит " + ch1);

        int d_int = 2147483647;
        System.out.println("переменная d_int содержит максимальное число " + d_int);

        long e_long = 9223372036854775807L;
        System.out.println("переменная e-long содержит максимальное число " + e_long);

        float f_float = 3.4e+38f;
        System.out.println("переменная f_float содержит максимальное число " + f_float);
        double g_double = 1.7e+308;
        System.out.println("переменная g_double содержит максимальное число " + g_double);

        boolean i_bollean = true;
        boolean i_bollean2 = false;
        System.out.println("переменная i_bollean содержит значение истина " + i_bollean);
        System.out.println("переменная i_bollean2 содержит значение ложь " + i_bollean2);

    }
}
       /*
       В Java типы данных делят на две большие группы: примитивные и ссылочные.
        В состав примитивных типов
       (или просто примитивов) входят четыре подвида и восемь типов данных:
        В Java есть 8 примитивных типов, которые делят на 4 группы, вот они:

Целые числа - byte, short, int, long
Числа с плавающей точкой (иначе вещественные) - float, double
Логический - boolean
Символьный - char

Тип	Размер (бит)	Диапазон
byte	8 бит	от -128 до 127
short	16 бит	от -32768 до 32767
char	16 бит	беззнаковое целое число, представляющее собой символ UTF-16 (буквы и цифры)
int	32 бит	от -2147483648 до 2147483647
long	64 бит	от -9223372036854775808L до 9223372036854775807L

float	32	от 1.4e-45f до 3.4e+38f
double	64	от 4.9e-324 до 1.7e+308

Логический тип
Тип	Размер (бит)	Значение
boolean	8 (в массивах), 32 (не в массивах используется int)	true (истина) или false (ложь)
В стандартной реализации Sun JVM и Oracle HotSpot JVM тип boolean занимает 4 байта (32 бита),
как и тип int. Однако, в определенных версиях JVM имеются реализации, где в массиве boolean
каждое значение занимает по 1-му биту.
*/