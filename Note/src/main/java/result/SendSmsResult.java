package result;


import domain.SendInfo;

/**
 * Created by jiacheo on 15/5/23.
 */
public class SendSmsResult extends ApiResultBase {

    private SendInfo result;

    public SendInfo getResult() {
        return result;
    }

    public void setResult(SendInfo result) {
        this.result = result;
    }
}
