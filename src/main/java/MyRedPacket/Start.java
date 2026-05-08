package MyRedPacket;

/*
 准备工作:
    1.图片素材.UI.项目下,创建pic , 将图片拷贝进去.  与module 平级.
    2.拷贝已有的代码.
        图形化 -- RedPacketFrame .
        红包开启 -- OpenMode .
   =====================================================



 */
public class Start {
    public static void main(String[] args) {

        //  创建 RedPacket
        RedPacket red = new RedPacket("Group");

        // 设置群主名称
        red.setOwnerName("小博");

        // 设置打开开启方式
        // red.setOpenWay(new PuTong());

        // 设置随机方式
        Lucky lucky = new Lucky();
        red.setOpenWay(lucky);


    }
}
