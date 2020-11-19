/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trong.util.test;

import org.junit.Test;
import static org.junit.Assert.*;
import trong.util.MathUtility;

/**
 *
 * @author DELL
 */
public class MathUtilityTest {
    @Test //kí hiệu của JUnit đưa ra, biến hàm ngay sau đây thành
    //public static void main(), app có nhiều main(),
    //F6 chạy main mặc định, Shift-F6 là chạy main() ở @Test
    //đây là 1 trong những cách dặt tên cho hàm test, để test code chính
    public void getFactorial_RunsWell_IfValidArgument() {
        assertEquals(720, MathUtility.getFactorial(6));
        assertEquals(120, MathUtility.getFactorial(5));
        assertEquals(240, MathUtility.getFactorial(4));
        assertEquals(6, MathUtility.getFactorial(3));
        assertEquals(1, MathUtility.getFactorial(0));
    }
    
    //Xanh chỉ đạt được nếu tất cả cùng xanh, hàm ý hàm đúng hết tất cả
    //Đỏ: chỉ cần ít nhất 1 thằng đỏ, coi như đỏ tất cả
    //Ý nghĩa: hàm đã đúng thì phải đúng hết, sai 1 cái hay vài cái
    //hàm k đáng tin

    //viết code để test code chính (MathUtility)
    //viết code dùng thư viện JUnit, NUnit, xUnit, Jasmine,... để test
    //xem code chính chạy ổn ko trước khi đem qua bên QC/Khách hàng trải nghiệm
    //và thư viện này cung c6a1p các cơ chế báo đúng sai qua màu sắc xanh đỏ
    // mắt chỉ nhìn 2 màu là đủ, khỏi cần so sánh expected và actual rồi kết
}
