package cc.xpbootcamp.code_smell_recognise.$14;

import lombok.Data;
import java.util.Date;

@Data
public class ProductBatch {
    private String name;
    private String batchId;
    private int batchCountTotal;
    private int batchCountLeft;
    private Date expiredDate;
}
