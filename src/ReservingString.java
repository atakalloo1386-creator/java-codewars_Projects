public class ReservingString {
        public static String solution(String str) {
            StringBuilder res = new StringBuilder();
            res.append(str);
            res.reverse();
            return res.toString();
        }
    }

