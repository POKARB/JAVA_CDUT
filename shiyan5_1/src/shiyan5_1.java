public class shiyan5_1 {
    public static void main(String[] args) {
        State state1 = new hero();
        state1.Run();
        state1.Idle();
        state1.Attack();
        state1.Dead();
        System.out.println("<---角色变身--->");
        state1 = new monster();
        state1.Run();
        state1.Idle();
        state1.Attack();
        state1.Dead();
    }
}
