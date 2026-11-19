package Day17.Sealed_Interface;

public sealed interface Payment
        permits Cash, Card, UPI {
}
