import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTimeHandler extends ImageAttributeHandler {
    @Override
    protected void process(Image image) {
        String time = new SimpleDateFormat("HHmmss").format(new Date());
        image.setCreationTime(time);
        
        String date = new SimpleDateFormat("yyyyMMdd").format(new Date());
        image.setCreationDate(date);
    }
}