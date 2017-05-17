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

    public final static String[] TOSTATION_INPUT = iTicketPageEles.get("toStation_Input");//目的地输入框

    public final static String[] TOSTATION_BUTTON = iTicketPageEles.get("toStation_Button");//目的地选地按钮

    public final static String[] STARTDAY_BUTTON = iTicketPageEles.get("startDay_Button");//出发日选择框

    public final static String[] BACKDAY_BUTTON = iTicketPageEles.get("backDay_Button");//返程日选择框

    public final static String[] ORDINARY_BUTTON = iTicketPageEles.get("ordinary_Button");//普通车票

    public final static String[] STUDENTS_BUTTON = iTicketPageEles.get("students_Button");//学生车票

    public final static String[] QUERY_BUTTON = iTicketPageEles.get("query_Button");//查询按钮

    public final static String[] AUTO_QUERY = iTicketPageEles.get("auto_query");//开启自动查询按钮

    public final static String[] ALLCAR_BUTTON = iTicketPageEles.get("allCar_Button");//全部车型

    public final static String[] GCCAR_BUTTON = iTicketPageEles.get("gcCar_Button");//GC-高铁/城际

    public final static String[] DCAR_BUTTON = iTicketPageEles.get("dCar_Button");//D-动车

    public final static String[] ZCAR_BUTTON = iTicketPageEles.get("zCar_Button");//Z-直达

    public final static String[] TCAR_BUTTON = iTicketPageEles.get("tCar_Button");//T-特快

    public final static String[] KCAR_BUTTON = iTicketPageEles.get("kCar_Button");//K-快速

    public final static String[] OTHERCAR_BUTTON = iTicketPageEles.get("otherCar_Button");//其他车

    public final static String[] STARTTIME_BUTTON = iTicketPageEles.get("startTime_Button");//发车时间

}
