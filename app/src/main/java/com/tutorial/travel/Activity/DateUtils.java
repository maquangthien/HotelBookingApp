package com.tutorial.travel.Activity;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class DateUtils {

    // Phương thức tính số ngày giữa hai ngày dưới dạng chuỗi
    public static int calculateNumberOfDays(String startDateStr, String endDateStr) {
        // Định dạng cho SimpleDateFormat
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        try {
            // Chuyển đổi chuỗi thành đối tượng Date
            Date startDate = sdf.parse(startDateStr);
            Date endDate = sdf.parse(endDateStr);
            long duration = endDate.getTime() - startDate.getTime();
            int numberOfDays = (int) (duration / (24 * 60 * 60 * 1000));

            // Trả về số ngày
            return numberOfDays;
        } catch (ParseException e) {
            e.printStackTrace();
            return 0;
        }
    }
    public static String getCurrentDateTime() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.getDefault());
        return sdf.format(new Date(System.currentTimeMillis()));
    }
}
