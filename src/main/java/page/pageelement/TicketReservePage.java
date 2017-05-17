package page.pageelement;/**
 * Created by taoxu on 2017/5/17.
 */

import units.XMLHelp;

import java.util.Map;

/**
 * @author taoxu
 * @create 2017-05-17-20:55
 **/
public class TicketReservePage {
    public final static Map<String, String[]> iTicketPageEles = new XMLHelp("elementdata/TicketReservePage.xml").getele();

    public final static String[] FROMSTATION_INPUT = iTicketPageEles.get("fromStation_Input");//出发地输入框

    public final static String[] FROMSTATION_BUTTON = iTicketPageEles.get("fromStation_Button");//出发地选地按钮

    public final static String[] toStation_Input = iTicketPageEles.get("toStation_Input");//目的地输入框

    public final static String[] toStation_Button = iTicketPageEles.get("toStation_Button");//目的地选地按钮

    public final static String[] startDay_Button = iTicketPageEles.get("startDay_Button");//出发日选择框

    public final static String[] backDay_Button = iTicketPageEles.get("backDay_Button");//返程日选择框

    public final static String[] ordinary_Button = iTicketPageEles.get("ordinary_Button");//普通车票

    public final static String[] students_Button = iTicketPageEles.get("students_Button");//学生车票

    public final static String[] query_Button = iTicketPageEles.get("query_Button");//查询按钮

    public final static String[] auto_query = iTicketPageEles.get("auto_query");//开启自动查询按钮

    public final static String[] allCar_Button = iTicketPageEles.get("allCar_Button");//全部车型

    public final static String[] gcCar_Button = iTicketPageEles.get("gcCar_Button");//GC-高铁/城际

    public final static String[] dCar_Button = iTicketPageEles.get("dCar_Button");//D-动车

    public final static String[] zCar_Button = iTicketPageEles.get("zCar_Button");//Z-直达

    public final static String[] tCar_Button = iTicketPageEles.get("tCar_Button");//T-特快

    public final static String[] kCar_Button = iTicketPageEles.get("kCar_Button");//K-快速

    public final static String[] otherCar_Button = iTicketPageEles.get("otherCar_Button");//其他车

    public final static String[] startTime_Button = iTicketPageEles.get("startTime_Button");//发车时间

}
