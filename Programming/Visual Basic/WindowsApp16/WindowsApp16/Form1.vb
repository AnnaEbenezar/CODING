Public Class Form1
    Private Sub AddButton_Click(sender As Object, e As EventArgs) Handles addButton.Click

        quantityListBox.Items.Add(Val(quantityTextBox.Text))
        itemListBox.Items.Add(itemTextBox.Text)
        priceListBox.Items.Add(Val(priceTextBox.Text))
        itemTextBox.Clear()
        quantityTextBox.Clear()
        priceTextBox.Clear()
        quantityTextBox.Focus()
    End Sub

    Private Sub TotalButton_Click(sender As Object, e As EventArgs) Handles totalButton.Click

        Dim counter As Integer = 0
        Dim cost As Decimal = 0
        Do
            cost += quantityListBox.Items(counter) *
        priceListBox.Items(counter)
            counter += 1
        Loop While counter < priceListBox.Items.Count
        resultLabel.Text = String.Format("{0:C}", cost)
    End Sub
End Class
