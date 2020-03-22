/**
 * @Auther: VirtualChen601
 * @Date: 2019/9/16 19:47
 * @Description:给你一个有效的 IPv4 地址 address，返回这个 IP 地址的无效化版本。
 *
 * 所谓无效化 IP 地址，其实就是用 "[.]" 代替了每个 "."。
 */
public class DefanginganIPAddress {
    public String defangIPaddr(String address) {
     String ans=address.replace(".","[.]");
        return ans;

    }
}
