import java.nio.channels.ClosedChannelException;

class CloseableResource implements AutoCloseable {
    public void exceptionWork(boolean exception) throws WorkException {
        System.out.println("exceptionWork(" + exception + ")가 호출됨");

        if(exception)
            throw new WorkException("WorkException 발생");
    }

    public void close() throws CloseException {
        System.out.println("close()가 호출됨");
        throw new CloseException("CloseExceptiom 발생");
    }
}
