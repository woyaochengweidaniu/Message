package domain;


import result.ApiResultBase;

/**
 * Created by jiacheo on 15/5/18.
 */
public class SendInfo extends ApiResultBase {

    private Integer feeCount;

    private String mobile;

    public Integer getFeeCount() {
        return feeCount;
    }

    public void setFeeCount(Integer feeCount) {
        this.feeCount = feeCount;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }
}
