/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trong.main;

import trong.util.MathUtility;

/**
 *
 * @author DELL
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("5! = " + MathUtility.getFactorial(5));
        //tui gọi hàm tính 5! hy vọng hàm trả về 120
        //lát hỏi hàm chạy, coi thực tế là mấy - ACTUAL
        //tui so sáng với cái tui kỳ vọng trước đó, EXPECTED 120
        //ACTUAL == EXPECTED, HÀM CHẠY ĐÚNG CHO TÌNH HUỐNG NÀY, TEST CASE NÀY
        System.out.println("0! = " + MathUtility.getFactorial(0));
                                //expected = 1, actual: chạy mới biết
                                //chạy xong mới biết hàm đúng sai
        System.out.println("-5! = " + MathUtility.getFactorial(-5));
                                //expected: ĐẬP VÀO MẶT ILLEGALARGUMENTEXCEPTION
                                
        //cách test kiểu này gọi là: MANUAL
        //VÌ TA PHẢI NHÌN BẰNG MẮT ĐẺ LUẬN KẾT QUẢ
        
        //cách xịn sò, ta dùng màu sắc xanh đỏ để luận kết quả đúng sai của hàm
        //cách này gọi là TEST AUTOMATION
    }
}
