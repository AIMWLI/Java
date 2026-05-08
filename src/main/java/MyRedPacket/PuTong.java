package MyRedPacket;

import known.OpenMode;

import java.util.ArrayList;
/*
 普通红包 ,平均分.

 100  3

 1. 找到平均值  100/3 -> 33
 2. 发出(count - 1) 份 , 33
 3. 剩余的就是 最后一个红包

  totalMoney ,平均分组 count 份 ,保存到集合中.
 */
public class PuTong implements OpenMode {
    @Override
    public ArrayList<Integer> divide(int totalMoney, int count) {
       // 1. 求平均值
        int avg = totalMoney / count;

        // 2. 扣去 count-1 份的平均值. 保存到 集合 .
        // 2.1 创建集合
        ArrayList<Integer> list = new ArrayList<>();

        // 2.2 for
        for (int i = 0; i < count - 1; i++) {
            list.add(avg);
            totalMoney -= avg;
        }

        // 3.将剩余的最后一份,保存集合中
        list.add(totalMoney);
        // 4. 返回
        return list;
    }
}
