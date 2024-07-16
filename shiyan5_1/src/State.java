public interface State {
    abstract void Idle();
    abstract void Run();
    abstract void Attack();
    abstract void Dead();

}
