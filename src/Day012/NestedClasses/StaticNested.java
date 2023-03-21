package NestedClasses;

import java.lang.reflect.Parameter;

public class StaticNested {
    /**
     * Static nested очень похож на обычный внешний, но находится внутри другого класса, не является привязанными к
     * его внешнему классу
     * <p>
     * Чтобы создать его обьект нужно указать через точку класс в котором он находится
     * <p>
     * Он может содержать как и статически так и нестатичиские элементы
     * <p>
     * Static nested класс может обращатся даже к private элементам внешнего класса, но только если они являются static
     * <p>
     * Внешний класс может обращатся даже к private элементам static nested класса
     */
    public static void main(String[] args) {
        Human.Work work = new Human.Work("Programmer", 2000, 8);
        Human.Parameters parameters = new Human.Parameters("Anton", 25);
        Human.Body.Brain brain1 = new Human.Body.Brain(140);
        Human.Body.Head head1 = new Human.Body.Head("blue", "brown");
        Human.Body body = new Human.Body('m', 75, 180, head1, brain1, "white");
        Human human = new Human(parameters, body, work);
        System.out.println(human);
    }

    static class Human {
        Parameters parameter;
        Body body;
        Work work;

        public Human(Parameters parameter, Body body, Work work) {
            this.parameter = parameter;
            this.body = body;
            this.work = work;
        }

        @Override
        public String toString() {
            return "Parameter=" + parameter +
                    "\nBody=" + body +
                    "\nWork=" + work +
                    '}';
        }

        static class Parameters {
            private String name;
            private int age;

            public Parameters(String name, int age) {
                this.name = name;
                this.age = age;

            }

            @Override
            public String toString() {
                return "Human parameters{" +
                        "name='" + name + '\'' +
                        ", age=" + age +
                        '}';
            }
        }

        static class Body {
            private char sex;
            private int weigh;
            private int tall;
            private String color;
            Head head;
            Brain brain;

            public Body(char sex, int weigh, int tall, Head head, Brain brain, String color) {
                this.sex = sex;
                this.weigh = weigh;
                this.tall = tall;
                this.head = head;
                this.brain = brain;
                this.color = color;
            }

            @Override
            public String toString() {
                return "----{Human body{" +
                        "sex=" + sex +
                        ", weigh=" + weigh +
                        ", tall=" + tall +
                        "\nHead=" + head +
                        "\nBrain=" + brain +
                        "}---";
            }

            static class Head {
                private String colorEyes;
                private String colorHair;


                public Head(String colorEyes, String colorHair) {
                    this.colorEyes = colorEyes;
                    this.colorHair = colorHair;
                }

                @Override
                public String toString() {
                    return "Human head{" +
                            "colorEyes='" + colorEyes + '\'' +
                            ", colorHair='" + colorHair +
                            '}';
                }
            }

            static final class Brain {
                private final int iq;

                public Brain(int iq) {
                    this.iq = iq;
                }

                @Override
                public String toString() {
                    return "Human brain{" + " iq= " + iq;
                }
            }
        }

        static class Work {
            private String work;
            private int salary;
            private int horWorkInDay;

            public Work(String work, int salary, int horWorkInDay) {
                this.work = work;
                this.salary = salary;
                this.horWorkInDay = horWorkInDay;
            }

            @Override
            public String toString() {
                return "Human work = " + work + ", salary= " + salary + ", hourWorkInDay=" + horWorkInDay;
            }
        }
    }
}
