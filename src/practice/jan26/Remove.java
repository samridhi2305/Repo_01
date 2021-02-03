//package practice.jan26;
//
//public class Remove {
//
//    boolean almostIncreasingSequence(int[] sequence) {
//        int arr[] = sequence;
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
//            for (int m = 0; m < arr.length; m++) {
//                int b[] = new int[arr.length - 1];
//                int k = 0;
//                for (int i = 0; i < arr.length; i++) {
//                    if (i != index) {
//                        b[k] = arr[i];
//                        k++;
//                    }
//
//                }
//                for (int i = 0; i < b.length; i++) {
//                    if (b[j] == b[i] + 1) {
//                        i = i + 1;
//                        j = j + 1;
//                        count++;
//
//                    }
//                }
//                if (count == arr.length - 1) {
//                    return true;
//                } else
//                    return false;
//
//            }
//
//        }