//package practice.jan26;
//
//public class ArrayConsecutive {
//
//
//
//        public static void main(String[] args){
//
//
//
//        int arr[] = {1, 2, 3, 4, 5};
//        int array[] = new int[arr.length - 1];
//        int value = 0;
//        int count = 0;
//        int j = 1;
//        if (arr.length == 1) {
//            return true;
//        }
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[j] == arr[i] + 1) {
//                i = i + 1;
//                j = j + 1;
//                count++;
//
//            }
//
//        }
//        if (count == arr.length - 1) {
//            return true;
//        } else {
//            for (int remove = 0; remove < arr.length; remove++) {
//                int b[] = new int[arr.length - 1];
//                int k = 0;
//                for (int z = 0; z < arr.length; z++) {
//                    if (z != remove) {
//                        b[k] = arr[j];
//                        k++;
//                    }
//                    for (int i = 0; i < b.length; i++) {
//                        if (b[j] == b[i] + 1) {
//                            i = i + 1;
//                            j = j + 1;
//                            count++;
//
//                        }
//
//                    }
//
//                }
//
//                if(count==b.length-1){
//                    return true;
//                }
//                else return false;
//            }
//        }
//
//    }
//
