package android.bluetooth;

/**
 *@hide
 */
interface IBluetoothAvrcpControllerCallback
{
    void onGetElementAttrRsp(int numAttr, in int[] attrs, in String[] values);
}