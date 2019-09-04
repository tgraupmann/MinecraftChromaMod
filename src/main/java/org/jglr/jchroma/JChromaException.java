package org.jglr.jchroma;

public class JChromaException extends RuntimeException {

	private static final long serialVersionUID = 1432685597153192215L;

	private int err;

    public JChromaException(String s, int err) {
        super("Error in "+s+": "+errorCodeToString(err)+" ("+err+")");
        this.err = err;
    }

    /**
     * Translates an error code in a human readable String
     * @param err
     *          The error code
     * @return
     *          A human readable version of the error code
     */
    public static String errorCodeToString(int err) {
        switch (err) {
            case 0:
                return "No error";

            case 87:
                return "Invalid parameter";

            case 50:
                return "Not supported";
        }
        return "Unknown("+err+")";
    }

    /**
     * Returns the error code associated with this error
     * @return
     *          The error code
     */
    public int getErrorCode() {
        return err;
    }
}
