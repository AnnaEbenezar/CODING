Public Class DentalPaymentForm
    ' handles Click event
    Private Sub calculateButton_Click(sender As System.Object,
      e As System.EventArgs) Handles calculatebutton.Click

        ' clear text displayed in Label
        totalresult.Text = String.Empty

        ' if no name entered or no CheckBox checked, display message
        If (nameTextBox.Text = String.Empty) OrElse
         (cleancheckbox.Checked = False AndAlso
          xraycheckbox.Checked = False AndAlso
          cavitycheckbox.Checked = False AndAlso
          fluoridecheckbox.Checked = False AndAlso
          rootcanalcheckbox.Checked = False AndAlso
          othercheckbox.Checked = False) Then

            ' display an error message in a dialog
            MessageBox.Show(
            "Please enter a name and check at least one item",
            "Missing Information", MessageBoxButtons.OK,
            MessageBoxIcon.Error)
            ' if the Other TextBox is checked, but no price entered
        ElseIf othercheckbox.Checked = True AndAlso
         otherTextBox.Text = String.Empty Then

            ' if cost wasn't entered, display error dialog
            MessageBox.Show("Please enter cost of service",
            "No Cost Entered", MessageBoxButtons.OK,
            MessageBoxIcon.Error)
        Else ' add prices
            ' total contains amount to bill patient
            Dim total As Decimal = 0

            ' if patient had a cleaning
            If cleancheckbox.Checked = True Then
                total += Val(cleancostlabel.Text)
            End If

            ' if patient had a cavity filled
            If cavitycheckbox.Checked = True Then
                total += Val(fillingcostlabel.Text)
            End If

            ' if patient had an X-Ray taken
            If xraycheckbox.Checked = True Then
                total += Val(xraycostlabel.Text)
            End If

            ' if patient had fluoride treatment
            If fluoridecheckbox.Checked = True Then
                total += Val(fluoridecostlabel.Text)
            End If

            ' if patient had root canal
            If rootcanalcheckbox.Checked = True Then
                total += Val(rootcanalcostlabel.Text)
            End If

            ' if patient had some other service performed
            If othercheckbox.Checked = True Then
                total += Val(otherTextBox.Text)
            End If

            ' display the total
            totalresult.Text = String.Format("{0:C}", total)
        End If
    End Sub ' calculateButton_Click
End Class ' DentalPaymentForm

