public class TaxCalc {
    private double AGI;
    private double NTI;
    private double TI;
    private double AIT;

    public void setAGI(double AGI) 
    {
        this.AGI = AGI;
    }

    public void setNTI(double NTI)
    {
        this.NTI = NTI;
    }
    
    public void setTI(double TI)
    {
        this.TI = TI;
    }

    public void setAIT(double AIT)
    {
        this.AIT = AIT;
    }
    
    public double getAGI()
    {
        return this.AGI;
    }

    public double getNTI()
    {
        return this.NTI;
    }

    public double getTI()
    {
        this.TI = this.AGI - this.NTI;
        return this.TI;
    }

    public double getAIT()
    {
        this.AIT = Calc();
        return this.AIT;
    }

    public double Calc()
    {
        if (this.TI <= 0)
        {
            this.AIT = 0;
        } 

        else if (this.TI <= 50000000)
        {
            this.AIT = this.TI * 0.05;
        }

        else if (this.TI > 50000000 && this.TI <= 250000000)
        {
            this.AIT = (0.05 * 50000000) + (this.TI - 50000000) * 0.15;
        }

        else if (this.TI > 250000000 && this.TI <= 500000000)
        {
            this.AIT = (0.05 * 50000000) + (0.15 * 200000000) + (this.TI - 250000000) * 0.25;
        }

        else if (this.TI > 500000000)
        {
            this.AIT = (0.05 * 50000000) + (0.15 * 200000000) + (0.25 * 250000000) + (this.TI - 500000000) * 0.3;
        }
        
        return AIT;
    }
}
