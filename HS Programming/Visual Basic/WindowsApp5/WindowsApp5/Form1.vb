Public Class Form1
    Private Sub calculatebutton_Click(sender As Object, e As EventArgs) Handles calculatebutton.Click
        Dim years As Integer = 2
        Dim months As Integer = 0
        Dim price As Integer = 0
        Dim downPayment As Integer = 0
        Dim Interest As Double = 0
        Dim monthlyPayment As Decimal = 0
        Dim loanAmount As Integer = 0
        Dim monthlyInterest As Double = 0

        paymentListBox.Items.Clear()
        paymentListBox.Items.Add("Months" & ControlChars.Tab &
                                         ControlChars.Tab & "Monthly Payments")
        Try
            downPayment = Convert.ToInt32(downpaymenttextbox.Text)
            price = Convert.ToInt32(PriceTextBox.Text)
            Interest = Convert.ToDouble(interestTextBox1.Text) / 100

            loanAmount = price = downPayment
            monthlyInterest = Interest / 12

            Do While years <= 5
                months = 12 * years
                monthlyPayment = Convert.ToDecimal(
                                    Pmt(monthlyInterest, months, -loanAmount))
                paymentListBox.Items.Add(months & ControlChars.Tab &
                                     ControlChars.Tab & String.Format("{0:C}",
                                     monthlyPayment))
                years += 1
            Loop
        Catch formatExceptionParameter As FormatException
            MessageBox.Show(
                            "Please enter two integers for the price and down" &
                            ControlChars.CrLf & "payment and a decimal number" &
                            "for the interest,", "Invalid Number Format",
                            MessageBoxButtons.OK, MessageBoxIcon.Error)
        End Try
    End Sub
End Class


