Question link - https://leetcode.com/problems/defanging-an-ip-address/description/

class Solution {
    public String defangIPaddr(String address) {
        return address.replace(".","[.]");
    }
}
