package page.pagehelp;/**
 * Created by taoxu on 2017/5/17.
 */

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.HasInputDevices;
import page.pageelement.TicketReservePage;
import units.MyWebdriver;

/**
 * 车票预订页面行为
 *
 * @author taoxu
 * @create 2017-05-17-22:05
 **/
public class TicketReservePageHelp {
    private WebDriver driver;
    private MyWebdriver dr;

    public TicketReservePageHelp(WebDriver driver) {
        this.driver = driver;
    }

    /**
     * 执行查询车票方法
     */
    public boolean queryTicket(String fromstation, String toStation, String startDay) {
        try {
            //输入出发地
            dr.findElementSendKeys(TicketReservePage.FROMSTATION_INPUT[0], TicketReservePage.FROMSTATION_INPUT[1], fromstation);
            ((HasInputDevices) driver).getKeyboard().sendKeys(Keys.ARROW_DOWN);
            //注意这里不能用Keys.ENTER
            ((HasInputDevices) driver).getKeyboard().sendKeys(Keys.RETURN);
            //输入目的地
            dr.findElementSendKeys(TicketReservePage.TOSTATION_INPUT[0], TicketReservePage.TOSTATION_INPUT[1], toStation);
            ((HasInputDevices) driver).getKeyboard().sendKeys(Keys.ARROW_DOWN);
            ((HasInputDevices) driver).getKeyboard().sendKeys(Keys.RETURN);
            //输入出发日期
            //移除出发日期日历控件
            String str = "\"$('input[" + TicketReservePage.STARTDAY_BUTTON[0] + "=" + TicketReservePage.STARTDAY_BUTTON[1] + "]').removeAttr('readonly')\"";
            dr.excuteJS(str);
            dr.findElementSendKeys(TicketReservePage.STARTDAY_BUTTON[0], TicketReservePage.STARTDAY_BUTTON[1], startDay);
            //查询车票
            dr.findElementClick(TicketReservePage.QUERY_BUTTON[0], TicketReservePage.QUERY_BUTTON[1]);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}
