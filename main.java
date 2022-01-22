public class Main {
    public static void main(String[] args) throws IllegalAccessException {

        int state = 1;
        int b = 0;

        String str = "qert(123)www"; // ввод символов
        char[] str2 = str.toCharArray();
        char[] ch = new char[str.length()];

        while (b < str.length()) {
            switch (state) {

                case 1:
                    {
                        if (str2[b] == '(') {
                            state = 2;
                            b++;
                            break;
                        } else {
                            ch[b] = str2[b];
                            b++;
                            break;
                        }
                    }
                case 2:
                    {
                        if (str2[b] == (')')) {
                            state = 1;
                            b++;
                            break;
                        } else {
                            b++;
                            break;
                        }
                    }
            }

        }

        System.out.println(ch);
    }

}
